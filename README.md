# Stub To-Do 

## Описание заглушки
Поддерживаемые операции:

| Метод | URL                          | Описание                                 |
|-------|------------------------------|------------------------------------------|
| GET   | `/tasks`                     | Получить список всех задач               |
| POST  | `/tasks`                     | Создать новую задачу                     |
| PUT   | `/tasks/{id}/complete`       | Отметить задачу как завершённую (`DONE`) |

### 3.1. Пример объекта `Task`:

```json
{
  "id": 1,
  "title": "Купить хлеб",
  "description": "До 20:00",
  "status": "NEW"
}
```
---

### Запуск приложения:

```bash
docker-compose up --build
```
### Добавить товар:

```bash
curl -X POST http://localhost:8080/api/products \
  -H "Content-Type: application/json" \
  -d '{"name": "Сахар", "category": "Бакалея", "price": 79.90, "stock": 25}'
```
### Получить список задач:

```bash
curl http://localhost:8080/tasks
```
### Отметить задачу как выполненную:

```bash
curl -X PUT http://localhost:8080/tasks/1/complete
```

