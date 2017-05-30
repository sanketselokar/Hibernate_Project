/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



        
    var table= document.getElementById("table"), rIndex;
    
    for (i=0; i < table.rows.length; i++)
    {
        table.rows[i].onclick = function()
        {
            rIndex = this.rowIndex;
            console.log(rIndex);
            document.getElementById("rollNo").value = this.cells[0].innerHTML;
            document.getElementById("firstName").value = this.cells[1].innerHTML;
            document.getElementById("lastName").value = this.cells[2].innerHTML;
            document.getElementById("dob").value = this.cells[3].innerHTML;
            enableButtons();
        };
    }
    
    function enableButtons()
    {
        document.getElementById("edit").disabled = false;
    
}
    
    function showInputField() {
    //var x = this.id;
    
    var inputField = document.getElementById("inputField");
    inputField.style.display = 'block';
}
    
    
    function editUser() {

//main task- update

    var rno = document.getElementById('rollNo').value,
        fname = document.getElementById('firstName').value,
        lname = document.getElementById('lastName').value,
        dob = document.getElementById('dob').value;

//       

        //document.forms[0].action = "UpdateServlet2";
            document.forms[0].submit();
    // if(!checkEmptyInput()){
//        table.rows[rIndex].cells[0].innerHTML = rno;
//        table.rows[rIndex].cells[1].innerHTML = fname;
//        table.rows[rIndex].cells[2].innerHTML = lname;
//        table.rows[rIndex].cells[3].innerHTML = dob;
        
    // }
    
    
    
    hideInputField();
        clearInputField();
        disableButtons();
        
//        document.forms[0].action = "UpdateServlet2";
//            document.forms[0].submit();
};


        function hideInputField() {
    var inputField = document.getElementById("inputField");
    inputField.style.display = 'none';
}
 
 
 function clearInputField(){
    document.getElementById("rollNo").value = "";
    document.getElementById("firstName").value = "";
    document.getElementById("lastName").value = "";
    document.getElementById("dob").value = "";
}

//function enableButtons(){
//    document.getElementById("edit").disabled = false;
//    document.getElementById("delete").disabled = false;
//}

function disableButtons(){
    document.getElementById("edit").disabled = true;
    
}

