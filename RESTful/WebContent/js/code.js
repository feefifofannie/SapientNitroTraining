$('#updateButton').click(function(){
    	var year = $('#year').val();
    	var month = $('#month').val();
    	var day = $('#day').val();
        $.ajax({
            url : 'rest/date/update',
            type : 'PUT',
            data : {year: year, month: month, day: day},
            success : function(response) {
                alert(response);
            }
        });
    });

$('#deleteButton').click(function(){
	var year = $('#year').val();
	var month = $('#month').val();
	var day = $('#day').val();
    $.ajax({
        url : 'rest/date/delete',
        type : 'DELETE',
        data : {year: year, month: month, day: day},
        success : function(response) {
            alert(response);
        }
    });
});