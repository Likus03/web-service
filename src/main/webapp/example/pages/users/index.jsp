<html>
<head>Create new User</head>
<body>
<table>
    <thead>
    <tr>
        <th>firstname</th>
        <th>family</th>
        <th>age</th>
    </tr>
    </thead>
    <tbody>
    <form action="/users/create" method="post">
        <tr>
            <td><input type="text" name="firstname" placeholder="put your firstname"></td>
            <td><input type="text" name="surname" placeholder="put your surname"></td>
            <td><input type="text" name="age" placeholder="put your age"></td>
            <td><input type="submit" name="surname" value="create"></td>
        </tr>
    </form>
    </tbody>
</table>
</body>
</html>
