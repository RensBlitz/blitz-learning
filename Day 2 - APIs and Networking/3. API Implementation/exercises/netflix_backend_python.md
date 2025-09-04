# Mini-Netflix Flask (Controller-Only) — Windows + PyCharm + Python

A beginner-friendly, step-by-step guide to build a tiny **“Mini-Netflix”** REST API using Flask. This version:
- Uses **only a controller** with an in-memory list (no service, no repository, no database).
- Uses **plain Python classes** (no dataclasses).
- **Does not** use auto-ID generators like counters; instead, you compute IDs manually.
- Provides **function signatures and return statements only**, plus precise `# implement the following here` comments.

---

## 0) Prerequisites (Windows)
1. Install **Python** (3.10–3.12 recommended).  
   Verify in PowerShell:
   ```
   python --version
   ```
2. Install **PyCharm** (Community or Professional).
3. (Optional) Install **Postman** or use PyCharm’s built-in HTTP client.

---

## 1) Create the project in PyCharm
1. Open **PyCharm** → **New Project**.
2. **Location**: choose a folder, e.g., `C:\dev\mini-netflix-flask`.
3. **Interpreter**:  
   - Select **New Virtualenv** (recommended).  
   - Base interpreter: your Python installation (e.g., `Python 3.12`).
4. Create a file **`requirements.txt`** in the root:
   ```
   Flask==3.0.3
   flask-cors==4.0.1   # optional, only needed if calling from a browser frontend
   ```
5. In PyCharm terminal:
   ```
   pip install -r requirements.txt
   ```

---

## 2) Project structure you’ll use
```
mini-netflix-flask/
 ├─ app.py                           (Flask app + routes)
 ├─ models/
 │   ├─ __init__.py
 │   ├─ movie.py                     (domain model; plain class)
 │   └─ movie_input.py               (request body model)
 ├─ requirements.txt
 └─ requests.http                    (optional; HTTP client requests)
```

---

## 3) Model classes (plain classes)
**File:** `models/movie.py`
```python
class Movie:
    def __init__(self, id: int, title: str, genre: str, year: int, rating: float):
        self.id = id
        self.title = title
        self.genre = genre
        self.year = year
        self.rating = rating

    def to_dict(self) -> dict:
        return {
            "id": self.id,
            "title": self.title,
            "genre": self.genre,
            "year": self.year,
            "rating": self.rating,
        }
```

**File:** `models/movie_input.py`
```python
class MovieInput:
    def __init__(self, title: str | None, genre: str | None, year: int | None, rating: float | None):
        self.title = title
        self.genre = genre
        self.year = year
        self.rating = rating
```

---

## 4) Flask application (controller-only)
**File:** `app.py`
```python
from flask import Flask, jsonify, request
from flask_cors import CORS  # optional

from models.movie import Movie
from models.movie_input import MovieInput

app = Flask(__name__)
CORS(app)  # enable CORS if needed

# In-memory "store"
movies: list[Movie] = []

# Seed some initial movies
def seed():
    m1 = Movie(1, "Inception", "Sci-Fi", 2010, 8.8)
    m2 = Movie(2, "The Dark Knight", "Action", 2008, 9.0)
    movies.clear()
    movies.extend([m1, m2])

seed()

# GET /api/movies -> list all
@app.get("/api/movies")
def get_all_movies():
    # implement the following here:
    # 1) Convert each Movie to dict with to_dict()
    # 2) Return as JSON with status 200
    return jsonify([m.to_dict() for m in movies]), 200

# GET /api/movies/<id> -> get by id
@app.get("/api/movies/<int:id>")
def get_movie_by_id(id: int):
    # implement the following here:
    # 1) Find a Movie in 'movies' whose id == id
    # 2) If found -> jsonify(movie.to_dict()), 200
    # 3) If not found -> return "", 404
    return "", 404

# POST /api/movies -> create
@app.post("/api/movies")
def create_movie():
    # implement the following here:
    # 1) Parse JSON body; validate required fields (title not null)
    # 2) Determine new ID:
    #    next_id = 1 if movies empty else max(m.id for m in movies) + 1
    # 3) Create Movie with input values
    # 4) Add new Movie to 'movies'
    # 5) Return jsonify(new_movie.to_dict()), 200
    return jsonify(None), 200

# PUT /api/movies/<id> -> update
@app.put("/api/movies/<int:id>")
def update_movie(id: int):
    # implement the following here:
    # 1) Find existing movie by id
    # 2) If not found -> return "", 404
    # 3) Parse JSON; update fields
    # 4) Return jsonify(updated_movie.to_dict()), 200
    return "", 404

# DELETE /api/movies/<id> -> delete
@app.delete("/api/movies/<int:id>")
def delete_movie(id: int):
    # implement the following here:
    # 1) Find movie by id
    # 2) If not found -> return "", 404
    # 3) Remove from list
    # 4) Return "", 204
    return "", 204

if __name__ == "__main__":
    app.run(host="127.0.0.1", port=5000, debug=True)
```

---

## 5) Flask-specific notes vs. Spring Boot (for people transferring from the latter to the former)
- **Run mode**: Flask uses `app.run(debug=True)` in development. Spring Boot runs via `SpringApplication.run(...)`.
- **CORS**: Spring uses `@CrossOrigin`; Flask needs `flask-cors` installed + `CORS(app)`.
- **Configuration**: No `application.properties` file. Use `app.config` or environment variables if needed.
- **Structure**: Flask does not enforce layers (controller/service/repository). Everything is in `app.py` for this exercise.

---

## 6) Run the application (PyCharm)
1. Right-click `app.py` → **Run 'app'**.
2. Confirm console shows:
   ```
   * Running on http://127.0.0.1:5000
   ```
3. Keep it running while testing.

---

## 7) Quick tests with Postman

To test your API endpoints, use [Postman](https://www.postman.com/downloads/):

1. **Install Postman** and open it.
2. **Create a new request** for each endpoint:
   - **List all movies**
      - Method: `GET`
      - URL: `http://localhost:8080/api/movies`
   - **Get one movie**
      - Method: `GET`
      - URL: `http://localhost:8080/api/movies/1`
   - **Create a movie**
      - Method: `POST`
      - URL: `http://localhost:8080/api/movies`
      - Body: Select `raw` and `JSON`, then paste:
        ```json
        {
          "title": "Interstellar",
          "genre": "Sci-Fi",
          "year": 2014,
          "rating": 8.6
        }
        ```
   - **Update a movie**
      - Method: `PUT`
      - URL: `http://localhost:8080/api/movies/2`
      - Body: Select `raw` and `JSON`, then paste:
        ```json
        {
          "title": "The Dark Knight (Updated)",
          "genre": "Action",
          "year": 2008,
          "rating": 9.0
        }
        ```
   - **Delete a movie**
      - Method: `DELETE`
      - URL: `http://localhost:8080/api/movies/2`

3. **Send each request** and check the response in Postman.

---

## 8) PowerShell tests (optional)
```
Invoke-RestMethod -Uri "http://127.0.0.1:5000/api/movies"
Invoke-RestMethod -Uri "http://127.0.0.1:5000/api/movies/1"
$body = @{ title="Tenet"; genre="Sci-Fi"; year=2020; rating=7.3 } | ConvertTo-Json
Invoke-RestMethod -Method Post -Uri "http://127.0.0.1:5000/api/movies" -Body $body -ContentType "application/json"
```

---

## 9) Beginner notes
- Data resets each restart (because movies are stored in memory).
- Ensure PyCharm is using the correct **virtual environment** (check in Settings → Project → Python Interpreter).
- If port 5000 is busy, change `port=5001` in `app.run(...)` and update test requests.

