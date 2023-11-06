<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
    <link rel="stylesheet" type="text/css" href="login.css">
</head>
<body>
    <div class="welcome-message">
        <h1>Welcome, ${sessionScope.username}!</h1>
        <a href="LogoutServlet">Logout</a>
    </div>
</body>
</html>
