# ResturantManagementSystem
The Restaurant Management System is a console-based application designed to streamline the operations of a restaurant. This application allows restaurant staff to manage the menu, take customer orders, and keep track of all placed orders through a simple and user-friendly interface.

Features:

Menu Management:
View Menu: Display all available menu items along with their prices.
Add Menu Item: Add new items to the menu.
Remove Menu Item: Option to remove existing items from the menu.
Edit Menu Item: Modify details of existing menu items (not implemented in the basic version but can be added).

Order Management:
Place Order: Allow customers to place orders by selecting items from the menu.
View Orders: Display all orders placed along with the total price.
Order Details: Each order lists all the items ordered and the total cost.
Class Descriptions

MenuItem:
Attributes:
name (String): Name of the menu item.
price (double): Price of the menu item.

Methods:
getName(): Returns the name of the menu item.
getPrice(): Returns the price of the menu item.
toString(): Returns a string representation of the menu item in the format "name - $price".

Order:
Attributes:
items (List<MenuItem>): A list of menu items in the order.
Methods:
addItem(MenuItem item): Adds a menu item to the order.
getTotalPrice(): Calculates and returns the total price of all items in the order.
toString(): Returns a string representation of the order, listing all items and the total price.

Restaurant:
Attributes:
menu (List<MenuItem>): A list of all menu items available.
orders (List<Order>): A list of all orders placed.
Methods:
addMenuItem(MenuItem item): Adds a menu item to the menu.
getMenu(): Returns the list of all menu items.
placeOrder(Order order): Adds an order to the list of orders.
getOrders(): Returns the list of all placed orders.
Main

The entry point of the application, containing the main method.
Functionality:
Provides a menu-driven interface for the user to interact with the system.
Options to view the menu, place orders, and view all orders.
Uses a Scanner for user input to navigate through the options and perform actions.
User Interaction
Upon running the application, the user is presented with a main menu containing options to:

View the menu.
Place an order.
View all orders.
Exit the application.
View Menu: Lists all available items with their prices.
Place Order: Prompts the user to select items from the menu to add to an order. Users can finish their order by selecting '0'.
View Orders: Displays all placed orders, including the items in each order and the total price.
Exit: Terminates the application.
