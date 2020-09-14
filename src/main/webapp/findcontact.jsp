<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <body>
        <h2>
            Find Contact AddressBook
        </h2>
               <form:form method="post" action="find" modelAttribute="person">
                <table >
                 <tr>
                    <td>First Name : </td>
                    <td><form:input path="firstName"  /></td>
                 </tr>
                 <tr>
                     <td>Last Name : </td>
                     <td><form:input path="lastName"  /></td>
                 </tr>

                 <tr>
                  <td> </td>
                  <td><input type="submit" value="Find Contact" /></td>
                 </tr>
                </table>
               </form:form>
    </body>
</html>