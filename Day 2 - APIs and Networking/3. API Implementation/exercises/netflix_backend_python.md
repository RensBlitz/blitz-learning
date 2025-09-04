# Mini-Netflix Flask (Controller-Only) — Windows + PyCharm + Python

A beginner-friendly, step-by-step guide to build a tiny **“Mini-Netflix”** REST API using Flask. This version:
- Uses **only a controller** with an in-memory list (no service, no repository, no database).
- Uses **plain Python classes** (no dataclasses).
- **Does not** use auto-ID generators like counters; instead, you compute IDs manually.
- Provides **function signatures and return statements only**, plus precise `# implement the following here` comments.


---

## 0) Prerequisites (Windows)
1. Install **Python** (3.10–3.12 recommended).  
   Verify in terminal (bash):
   ```
   python --version
   ```
2. Install **PyCharm** (Community or Professional).
3. (Optional) Install **Postman** or use PyCharm’s built-in HTTP client.

---

## 1) Create the project in PyCharm
1. Open **PyCharm** → **New Project** → **Flask**.
2. **Location**: choose a folder, e.g., `C:\dev\mini-netflix-flask`.
3. **Environment**:  
   - Select **New Virtualenv** (recommended).  
   - Base interpreter: choose your Python version (e.g., `Python 3.12`).
4. Click **Create**.
5. If PyCharm generated `main.py`, rename it to `app.py` (or create `app.py`).
6. Create a file **`requirements.txt`** in the root (if not present):
   ```
   Flask==3.0.3
   flask-cors==4.0.1   # optional, only needed if calling from a browser frontend
   ```
7. In PyCharm terminal (if needed):
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

## 3) Step-by-step build-up

Follow these steps to grow the API gradually. Use the code snippets in sections 4–6 and only implement the part described in each step.

1. Step 1 — Create models
   - Create `models/movie.py` and `models/movie_input.py` as shown in section 5.
   - These define the domain object (`Movie`) and the request body (`MovieInput`).

2. Step 2 — Wire the app and seed data
   - In `app.py` (section 4): create the Flask app, optionally enable CORS, create the in-memory `movies` list, add the `seed()` function, and register the controller blueprint: `app.register_blueprint(movies_bp(movies))`.
   - You should now be able to run the app (see section 8) even before implementing controller logic.

3. Step 3 — Implement GET all
   - In the controller (section 6), inside `get(self, id=None)`, implement the branch for listing all movies (when `id` is `None`).
   - Convert each `Movie` to a dict with `to_dict()` and return JSON with status 200.

4. Step 4 — Implement GET by id
   - In the same `get` method, implement the branch for a specific id.
   - Return the movie as JSON (200) if found; otherwise return an empty body with 404.

5. Step 5 — Implement POST create
   - Parse and validate input (at least `title` not null) using `MovieInput`.
   - Compute the new id: `1` if no movies yet, else `max(m.id) + 1`.
   - Create and append a `Movie`, then return it as JSON (200).

6. Step 6 — Implement PUT update
   - Find the movie by `id`. Return 404 if missing.
   - Merge the provided fields into the existing `Movie` and return the updated movie as JSON (200).

7. Step 7 — Implement DELETE
   - Find by `id`, return 404 if missing.
   - Remove from the list and return an empty body with status 204.

8. Step 8 — Test after each step
   - Use Postman or PyCharm’s HTTP client (see section 9) to verify each endpoint before proceeding.

---

## 4) Main application

**File:** `app.py`
```python
from flask import Flask
from flask_cors import CORS  # optional

from controller import movies_bp
from movie import Movie

app = Flask(__name__)
CORS(app)  # enable CORS if needed

# In-memory "store"
movies: list[Movie] = []

# Seed initial movies
def seed():
    m1 = Movie(1, "Inception", "Sci-Fi", 2010, 8.8)
    m2 = Movie(2, "The Dark Knight", "Action", 2008, 9.0)
    movies.clear()
    movies.extend([m1, m2])

seed()

# Register controller (inject movies list)
app.register_blueprint(movies_bp(movies))

if __name__ == "__main__":
    app.run(host="127.0.0.1", port=5000, debug=True)
```

---

## 5) Model classes

**File:** `movie.py`
```python
class Movie:
    def __init__(self, id: int, title: str, genre: str, year: int, rating: float):
        self.id = id
        self.title = title
        self.genre = genre
        self.year = year
        self.rating = rating

    def to_dict(self):
        return {
            "id": self.id,
            "title": self.title,
            "genre": self.genre,
            "year": self.year,
            "rating": self.rating,
        }
```

**File:** `movie_input.py`
```python
class MovieInput:
    def __init__(self, title: str = None, genre: str = None, year: int = None, rating: float = None):
        self.title = title
        self.genre = genre
        self.year = year
        self.rating = rating

    @staticmethod
    def from_dict(data: dict):
        return MovieInput(
            title=data.get("title"),
            genre=data.get("genre"),
            year=data.get("year"),
            rating=data.get("rating"),
        )
```

---

## 6) Controller

**File:** `controller.py`
```python
from typing import List, Optional, Callable
from flask import Blueprint, jsonify, request
from flask.views import MethodView

from movie import Movie
from movie_input import MovieInput

def movies_bp(movies: List[Movie]) -> Blueprint:
    bp = Blueprint("movies", __name__, url_prefix="/api/movies")

    class MoviesController(MethodView):
        # GET /api/movies → list all
        # GET /api/movies/<id> → get one by id
        def get(self, id: Optional[int] = None):
            if id is None:
                # implement the following here:
                # 1) Convert each Movie to dict with to_dict()
                # 2) Return as JSON with status 200
                return jsonify([m.to_dict() for m in movies]), 200

            # implement the following here:
            # 1) Find a Movie with id == id
            # 2) If found → jsonify(movie.to_dict()), 200
            # 3) If not found → return "", 404
            return "", 404

        # POST /api/movies → create
        def post(self):
            # implement the following here:
            # 1) Parse JSON body; validate required fields (title not null)
            # 2) Determine new ID:
            #    next_id = 1 if movies empty else max(m.id for m in movies) + 1
            # 3) Create new Movie
            # 4) Add to 'movies'
            # 5) Return jsonify(new_movie.to_dict()), 200
            return jsonify(None), 200

        # PUT /api/movies/<id> → update
        def put(self, id: int):
            # implement the following here:
            # 1) Find movie by id
            # 2) If not found → return "", 404
            # 3) Parse JSON; update fields
            # 4) Return jsonify(updated_movie.to_dict()), 200
            return "", 404

        # DELETE /api/movies/<id> → delete
        def delete(self, id: int):
            # implement the following here:
            # 1) Find movie by id
            # 2) If not found → return "", 404
            # 3) Remove from list
            # 4) Return "", 204
            return "", 204

    view: Callable = MoviesController.as_view("movies_controller")
    bp.add_url_rule("", view_func=view, methods=["GET", "POST"])
    bp.add_url_rule("/", view_func=view, methods=["GET", "POST"])
    bp.add_url_rule("/<int:id>", view_func=view, methods=["GET", "PUT", "DELETE"])

    return bp
```
---

## 7) Flask-specific notes vs. Spring Boot (for people transferring from the latter to the former)
- **Run mode**: Flask uses `app.run(debug=True)` in development. Spring Boot runs via `SpringApplication.run(...)`.
- **CORS**: Spring uses `@CrossOrigin`; Flask needs `flask-cors` installed + `CORS(app)`.
- **Configuration**: No `application.properties` file. Use `app.config` or environment variables if needed.
- **Structure**: Flask does not enforce layers (controller/service/repository). Everything is in `app.py` for this exercise.

---

## 8) Run the application (PyCharm)
1. Right-click `app.py` → **Run 'app'**.
2. Confirm console shows:
   ```
   * Running on http://127.0.0.1:5000
   ```
3. Keep it running while testing.

---

## 9) Quick tests with Postman

To test your API endpoints, use [Postman](https://www.postman.com/downloads/):

1. **Install Postman** and open it.
2. **Create a new request** for each endpoint:
   - **List all movies**
      - Method: `GET`
      - URL: `http://localhost:5000/api/movies`
   - **Get one movie**
      - Method: `GET`
      - URL: `http://localhost:5000/api/movies/1`
   - **Create a movie**
      - Method: `POST`
      - URL: `http://localhost:5000/api/movies`
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
      - URL: `http://localhost:5000/api/movies/2`
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
      - URL: `http://localhost:5000/api/movies/2`

3. **Send each request** and check the response in Postman.

---

## 10) Beginner notes
- Data resets each restart (because movies are stored in memory).
- Ensure PyCharm is using the correct **virtual environment** (check in Settings → Project → Python Interpreter).
- If port 5000 is busy, change `port=5001` in `app.run(...)` and update test requests.

