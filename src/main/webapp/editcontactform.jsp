<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <body>
        <h2>
            Edit Contact
        </h2>
        <form:form method="post" action="/edit" modelAttribute="person" >
                        <table >
                        <tr>
                            <td>First Name : </td>
                            <td>${person.firstName}</td>
                        </tr>
                        <tr>
                             <td>Last Name : </td>
                             <td>${person.lastName}</td>
                        </tr>
                        <tr>
                             <td><form:hidden  path="firstName" /></td>
                        </tr>
                        <tr>
                             <td><form:hidden  path="lastName" /></td>
                         </tr>
                         <tr>
                              <td>Address : </td>
                              <td><form:input path="address"  /></td>
                         </tr>
                         <tr>
                              <td>City : </td>
                              <td><form:input path="city"  /></td>
                         </tr>
                         <tr>
                              <td>State : </td>
                              <td><form:input path="state"  /></td>
                         </tr>
                         <tr>
                              <td>Zipcode :</td>
                              <td><form:input path="zipcode" /></td>
                         </tr>
                         <tr>
                              <td>Phone No :</td>
                              <td><form:input path="phoneNumber" /></td>
                         </tr>
                         <tr>
                          <td> </td>
                          <td><input type="submit" value="Edit Contact" /></td>
                         </tr>
                        </table>
                       </form:form>
    </body>
</html>