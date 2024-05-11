
# Coding Contest

Coding Contest is an application which lets you maintain user information for a Coding Contest leaderboard.It has various Http endpoints to register, fetch, update and delete users from the leaderboard.




## API Reference

#### Get all users

```http
  GET /codingcontest/api/v1/users
```

#### Get user by id
```http
  GET /codingcontest/api/v1/users/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |

#### Create a new User

```http
  POST /codingcontest/api/v1/users
```
Request Body
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `userName`      | `string` | **Required**. userName of user |


Takes userName and create a new user with default score equal  to 0

#### Public Postman collection to test API
https://www.postman.com/mission-saganist-78647024/workspace/coding-contest-apis/request/19091992-bb7335b0-71db-4c4d-b286-5cf028c2393a



## Deployment

To run this project run

```bash
  ./gradlew bootrun
```

