#Spring Boot Book Seller

### Endpoints

#### Sign-Up

```
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "name":"name_1",
    "username":"username_1",
    "password":"password_1"
}
```

#### Sign-In

```
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "username":"username_1",
    "password":"password_1"
}
```

#### Make-admin

```
PUT /api/internal/make-admin/admin_1 HTTP/1.1
Host: localhost:8080
Authorization: Bearer InternalApiKey1234!
```

#### Save Book

```
POST /api/book HTTP/1.1
Host: localhost:8080
Authorization: Bearer ... admin
Content-Type: application/json

{
    "title":"Test Book",
    "price":10,
    "description":"Test description",
    "author":"Test author"
}
```

#### Delete Book

```
DELETE /api/book/1 HTTP/1.1
Host: localhost:8080
Authorization: Bearer ... admin
```

#### Get All Books

```
GET /api/book HTTP/1.1
Host: localhost:8080
```

#### Save Purchase

```
POST /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer ... user or admin
Content-Type: application/json
Content-Length: 57

{
    "userId": 1,
    "bookId": 1,
    "price": 10
}
```

#### Get User Purchases

```
GET /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer ... user or admin
```