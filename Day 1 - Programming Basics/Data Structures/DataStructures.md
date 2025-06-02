# Data Structures 📚

## What is a Data Structure? 🤔

A data structure is a specialized way of organizing, storing, and managing data in a computer so that it can be used efficiently. Data structures determine how data is accessed, modified, and processed in a program.

### Real-world Analogy 🌍
Think of data structures like different types of organizers:
- A **bookshelf** organizes books (like an array or list)
- A **phone book** lets you look up names and numbers (like a map or dictionary)
- A **queue at a store** (first-in, first-out) is like a queue data structure
- A **stack of plates** (last-in, first-out) is like a stack data structure

## Core Principles 🧠
- **Linear Structures**: Data is arranged in a sequence (e.g., arrays, lists, queues, stacks)
- **Non-linear Structures**: Data is arranged hierarchically or in networks (e.g., trees, graphs)
- **Access Patterns**: How you retrieve or update data (e.g., by index, by key, by traversal)
- **Efficiency**: Different structures are optimized for different operations (e.g., fast lookup, fast insertion)

## Common Use Cases 🛠️
- Storing collections of items (e.g., numbers, objects)
- Implementing algorithms (sorting, searching)
- Modeling real-world systems (networks, hierarchies)
- Managing resources (task scheduling, undo/redo stacks)
- Associating keys with values (dictionaries, maps)

## Syntax and Implementation 📝

### Pseudocode (Language-Independent)
```pseudocode
// Array
array = [item1, item2, item3]

// List
list = empty_list()
list.add(item)

// Stack
stack = empty_stack()
stack.push(item)
item = stack.pop()

// Queue
queue = empty_queue()
queue.enqueue(item)
item = queue.dequeue()

// Map/Dictionary
map = empty_map()
map[key] = value
value = map[key]
```

## Language-Specific Examples

### Java ☕
```java
// Array
int[] numbers = {1, 2, 3};

// List
List<String> names = new ArrayList<>();
names.add("Alice");

// Stack
Stack<Integer> stack = new Stack<>();
stack.push(10);
int top = stack.pop();

// Queue
Queue<String> queue = new LinkedList<>();
queue.add("first");
String next = queue.poll();

// Map
Map<String, Integer> ages = new HashMap<>();
ages.put("Alice", 30);
int age = ages.get("Alice");
```

### Python 🐍
```python
# List
numbers = [1, 2, 3]
names = []
names.append("Alice")

# Stack (using list)
stack = []
stack.append(10)
top = stack.pop()

# Queue (using collections.deque)
from collections import deque
queue = deque()
queue.append("first")
next = queue.popleft()

# Dictionary
ages = {"Alice": 30}
age = ages["Alice"]
```

### JavaScript 🟨
```javascript
// Array
let numbers = [1, 2, 3];
let names = [];
names.push("Alice");

// Stack (using array)
let stack = [];
stack.push(10);
let top = stack.pop();

// Queue (using array)
let queue = [];
queue.push("first");
let next = queue.shift();

// Object as map
let ages = {"Alice": 30};
let age = ages["Alice"];
```

### TypeScript 🔷
```typescript
let numbers: number[] = [1, 2, 3];
let names: string[] = [];
names.push("Alice");

let stack: number[] = [];
stack.push(10);
let top: number = stack.pop()!;

let queue: string[] = [];
queue.push("first");
let next: string = queue.shift()!;

let ages: { [key: string]: number } = {"Alice": 30};
let age: number = ages["Alice"];
```

## Key Differences Between Languages 📊

| Feature         | Java (Collections)   | Python (Built-ins) | JavaScript (Arrays/Objects) | TypeScript (Arrays/Objects) |
|-----------------|---------------------|--------------------|-----------------------------|-----------------------------|
| Arrays          | Yes                 | Yes                | Yes                         | Yes                         |
| Lists           | Yes (List)          | Yes (list)         | Yes (Array)                 | Yes (Array)                 |
| Stacks/Queues   | Yes (Stack/Queue)   | Yes (list/deque)   | Yes (Array)                 | Yes (Array)                 |
| Maps/Dictionaries| Yes (Map)          | Yes (dict)         | Yes (Object/Map)            | Yes (Object/Map)            |
| Type Safety     | Strong              | Dynamic            | Weak                        | Strong                      |

## Best Practices ✅
- Choose the right data structure for your use case
- Prefer interfaces (e.g., List, Map) over concrete implementations
- Initialize collections with the correct type
- Avoid using raw types (e.g., List instead of List<String>)
- Be aware of performance trade-offs (e.g., ArrayList vs. LinkedList)

## Common Pitfalls ⚠️
- Using the wrong data structure for the task
- Forgetting to check for null or empty collections
- Concurrent modification exceptions
- Type safety issues with raw types
- Off-by-one errors in loops

## Advanced Concepts 🚀
- **Generics**: Writing collections that work with any type
- **Custom Data Structures**: Implementing your own (e.g., linked lists, trees)
- **Big O Notation**: Analyzing performance of operations
- **Immutable Collections**: Collections that cannot be changed after creation

## Related Concepts 🔄
- Variables
- Data Types
- Algorithms
- Control Flow
- Memory Management 