## Login
The login form is the application entry point. It presents two fields — Username and Password 
admin 1234
user1 1234
![alt text](/images/image.png)

## admin index
When logged in as admin, the product list page displays all products plus a blue 'New Product' button, and each row includes a red 'Delete' button for removing individual records.
![alt text](/images/image2.png)

## product creation form
The product creation form provides three input fields: Name (text), Price (decimal, default 0.0), and Quantity (integer, default 0). Only an admin can create a product and access this form
![alt text](/images/image3.png)

## user index
When logged in as a regular user (e.g., user1), the same product list is displayed but without the 'New Product' button and without 'Delete' buttons on each row. The table is purely read-only.
![alt text](/images/image4.png)
