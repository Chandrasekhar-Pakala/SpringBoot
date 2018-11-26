<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div style="color: green" >List of Stores :</div>
<table>
   <tr>
	   <th width="20%">Name</th>
	   <th width="50%">Description</th>
	   <th width="30%">Type</th>
   </tr>
   
	<c:forEach var="store" items="${stores}">
	    <tr>
		    <td style="text-align: center"><font color="#00CC00"><c:out value="${store.name}"/></font></span></td>
		    <td style="text-align: center"><font color="#00CC00"><c:out value="${store.description}"/></font></td>
		    <td style="text-align: center"><font color="#00CC00"><c:out value="${store.type}"/></font></td>
	    </tr>
	</c:forEach>
</table>