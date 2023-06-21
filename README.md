# Census-Records-and-Management
Java Project
1. Write the title of the project.
Title:- Census Records and Management

2. Explain in brief about the project.
This project replicates the functioning of the Indian Census records. Instead of storing all
the information in a database, we have used data structures to optimize the functionality of
basic operations such as –adding, updating, searching, and deleting in the best possible
time complexity.
A multi-level linked-list stores all states of India at the top level and their corresponding
districts at the subsequent level. All states and districts contain several attributes including
– population, literacy, and religion of all categories.
The program allows the user to enter their personal details into the central record and read
all indicators of India or any state or district of their choice. The admin is granted
permission to read, edit and compare the attributes of any or all the states and districts.
The program contains two interfaces with different access privileges –
- Admin
- User
The Admin is allowed to read, write and update static data present in the program.
Whereas the user only has read-only privileges.
User entering data –
1. The user enters the aadhaar card number which is then validated by the program.
2. The user enters their personal details.
3. Once all details are entered, they are passed as parameters into a node. This node is then
attached to the singly linked list which contains all user details.
Updating the static data –
4. If the individual is a male, the male population of the corresponding district and state is
incremented. If he is literate (i.e. above the age of 7 and can read and write), the male
literacy average is updated. Similar protocols are followed if the user is a female.
User updating details -
The user also has the option to update their details. The program traverses through the
linked list to find the user details through the aadhaar card number provided by the user.

Data entered in the multi-level doubly linked list –
Attributes –
- Population
o Male
o Female
o Total
- Average literacy
o Male
o Female
- Religious diversity (as % of the total population)
o Hindu
o Jain
o Christian
o Buddhist
o Muslim
o Sikh
o Others

Admin –
- Add/Update/Delete District/State
- The program initially traverses through the linked list to find the entered state and
district.
- New values are accepted by the admin. All attributes entered by the are updated.
Compare and Display –
- Comparison of 2 states or districts -
All attributes of the respective states and districts are displayed along with the
percentage difference between them.
- Comparison of a state/district over 2022,2011 and 2001.
All attributes of the respective state and district are displayed along with the percentage
change within the three years.
All states and districts of India –
- Names of all states and corresponding districts are displayed.
- Population and literacy of all states are iteratively added and the cumulative data is
then displayed.

3. List all data structures used. Justify why did you select these data structures?
A doubly multi-level linked list is a non-linear data structure that helps us establish a

hierarchy between all states and districts. The doubly linked list helps us perform
deletion with the best possible time complexity.
A multilevel linked list is represented by a pointer to the first node of the linked list.
Similarly to the linked list, the first node is called the head. If the multilevel linked
list is empty, then the value of the head is NULL. Each node in a list consists of at
least three parts:
1. Data.
2. Pointer to the next node.
3. Pointer to the child node.
A singly linked list is also used to store the new user and their details.
