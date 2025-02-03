<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Interface</title>
</head>
<body>
    <header>
        <h1>Welcome to Laptop Shop</h1>
    </header>
    <main>
        <section id="user-info">
            <h2>User Information</h2>
            <p>Name: John Doe</p>
            <p>Email: john.doe@example.com</p>
        </section>
        <section id="user-actions">
            <h2>Actions</h2>
            <button onclick="editProfile()">Edit Profile</button>
            <button onclick="viewOrders()">View Orders</button>
        </section>
    </main>
    <footer>
        <p>&copy; 2025 Laptop Shop. All rights reserved.</p>
    </footer>
    <script>
        function editProfile() {
            alert('Edit Profile clicked');
        }

        function viewOrders() {
            alert('View Orders clicked');
        }
    </script>
</body>
</html>