/**
 * 
 */
function access(func){
	func();
}

var employee = {
	firstName: 'Arafath',
	lastName: 'Aboobacker',
	netSalary:function(){
		alert('Total Salary');
	}
};


//setInterval(function(){ alert("Does this frustrate you? Let me know in 3..2..1"); }, 30000);
//employee.netSalary();
var btnClickRef = document.getElementById('btnClick');

var eventHandler = function() {
	employee.firstName = 'Anil';
	alert(employee.firstName);
	employee.netSalary();
};

function Name(first, last) {
	firstName = first;
	lastName = last;
	fullName = function() {
		return firstName+' '+lastName;
	};
}

name = new Name("Elizabeth", "Myers");
alert(name.fullName());