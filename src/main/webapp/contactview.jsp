<html>
    <body>
        <h2>
            Contact View
        </h2>

    <table border="1" width="70%" cellpadding="2">
    <tr><th>First Name</th><th>Last Name</th><th>Address</th><th>City</th><th>State</th><th>Zipcode</th><th>Phone Number</th><th>Edit</th><th>Delete</th></tr>
       <tr>
       <td>${person.firstName}</td>
       <td>${person.lastName}</td>
       <td>${person.address}</td>
       <td>${person.city}</td>
       <td>${person.state}</td>
       <td>${person.zipcode}</td>
       <td>${person.phoneNumber}</td>
       <td><a href="editcontact/${person.firstName}/${person.lastName}">Edit</a></td>
       <td><a href="deletecontact/${person.firstName}/${person.lastName}">Delete</a></td>
       </tr>
       </table>
    </body>
</html>