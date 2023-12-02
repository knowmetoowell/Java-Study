/**
 * .getScript test
 */
$.getJSON( "result.jsp", function( data ) {
  var items = '<table>';
  items += '<tr><th>제목</th><th>내용</th></tr>';
  
  $.each( data, function( key, val ) {
    items += `
    			<tr>
    				<td>${key}</td>
    				<td>${val}</td>
    			</tr>
    		  `;
  });
 
  items += '</table>';
  
  $('#result').append(items);
});