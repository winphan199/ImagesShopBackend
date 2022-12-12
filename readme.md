# ImageShop Backend

This is rest api used for ImageShop project for Fullstack Web Application Course 2022.

## Installation

```
mvn install && java -jar target/backend-0.0.1-SNAPSHOT.jar
```

## Usage

### Get list of images

`GET /api/images`

#### Response

List of images

```
[
    {
        "id": 1,
        "description": "zxcczx",
        "name": "abc",
        "url": "zdvsv",
        "tag": "xczcxvcxvv",
        "new": false
    },
    {
        "id": 2,
        "description": "zxcczx",
        "name": "axcxcbc",
        "url": "zdvsv",
        "tag": "xczcxvcxvv",
        "new": false
    }
]
```

### Store image in database

`POST /api/images`

#### Request Header

Must contains:

```
Authorization: Bearer xxxxxxx
```

#### Response

Image you just send to the server

```
{
    "id": 2,
    "description": "zxcczx",
    "name": "axcxcbc",
    "url": "zdvsv",
    "tag": "xczcxvcxvv",
    "new": false
}
```

### Sign Up

`POST /api/auth/signup`

#### Request header

Must contains:

```
Content-Type: Application/json
```

#### Request body

Example:

```
{
    "username": "abc",
    "email": "abc@gmail.com",
    "password": "12345678"
}
```

#### Response

Successful response:

```
{
    "message": "User registered successfully!"
}
```

### Sign In

`POST /api/auth/signin`

#### Request header

Must contains:

```
Content-Type: Application/json
```

#### Request body

Example:

```
{
    "username": "abc",
    "password": "12345678"
}
```

#### Response

Successful response:

```
{
    "id": 2,
    "username": "abc",
    "email": "abc@gmail.com",
    "roles": [
        "ROLE_USER"
    ],
    "accessToken": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhYmMiLCJpYXQiOjE2NzA2OTgyODUsImV4cCI6MTY3MDc4NDY4NX0.KYF0HzYBQMK5o8OV6RgMgDneB_yyQimosdhaCtMStjHMglODwSSwfsLNMtQnp1qSWf6Er_vY_qaFNBdaqEzyfA",
    "tokenType": "Bearer"
}
```

Use access token for posting images.

## Contributors

- Hung Phan
- Tuong Hoang
- Minh Dang
