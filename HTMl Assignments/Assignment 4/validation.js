function valid()
{
    console.log("ok");
    //alert("hell0")
    var name1 = document.getElementById("fname").value;
    var ageid = document.getElementById("age").value;
    var phoonenumber = document.getElementById("phnum").value;
    var uname1 = document.getElementById("uname").value;
    var pass = document.getElementById("passs").value;
    var mgen = document.getElementById("male").checked;
    var fgen = document.getElementById("female").checked;
    //var rbtn =  document.getElementById("myRadio").checked;
    

    if(name1.length==0)
    {
        document.getElementById("e1").innerHTML= "User Name Must Required"
        document.getElementById("e3").innerHTML= ""
        document.getElementById("e2").innerHTML= ""
        document.getElementById("e3").innerHTML= ""
        document.getElementById("e4").innerHTML= ""
        document.getElementById("e5").innerHTML= ""
        document.getElementById("e6").innerHTML= ""
        return false;

    }
    else if(fgen==false && mgen==false)
    {
        
        document.getElementById("e2").innerHTML= "User Name Must Required"
        document.getElementById("e1").innerHTML= "";
        document.getElementById("e3").innerHTML= "";
        document.getElementById("e4").innerHTML= "";
        document.getElementById("e5").innerHTML= "";
        document.getElementById("e6").innerHTML= "";
        //document.getElementById("e2").innerHTML= "";
        //alert("hello")
        return false;
    }
    else if(ageid<21)
    {
        document.getElementById("e3").innerHTML= "Aged must be grater than 21";
        document.getElementById("e1").innerHTML= "";
        document.getElementById("e2").innerHTML= "";
        document.getElementById("e4").innerHTML= "";
        document.getElementById("e5").innerHTML= "";
        document.getElementById("e6").innerHTML= "";
        return false;
    }
    else if(phoonenumber.length<9)
    {
        document.getElementById("e4").innerHTML= "Right Phone NUmber Must Required";
        document.getElementById("e1").innerHTML= "";
        document.getElementById("e3").innerHTML= "";
        document.getElementById("e2").innerHTML= "";
        document.getElementById("e5").innerHTML= "";
        document.getElementById("e6").innerHTML= "";
        return false;
    }
    else if(uname1.length==0)
    {
        document.getElementById("e5").innerHTML= "User Name Must Required";
        document.getElementById("e1").innerHTML= "";
        document.getElementById("e3").innerHTML= "";
        document.getElementById("e4").innerHTML= "";
        document.getElementById("e2").innerHTML= "";
        document.getElementById("e6").innerHTML= "";
        return false;
    }
    else if(pass.length==0)
    {
        document.getElementById("e6").innerHTML= "Password Must Required";
        document.getElementById("e1").innerHTML= "";
        document.getElementById("e3").innerHTML= "";
        document.getElementById("e4").innerHTML= "";
        document.getElementById("e5").innerHTML= "";
        document.getElementById("e2").innerHTML= "";
        return false;
    }
    else if(pass.length!=0)
    {
        if (pass.length < 8) 
        {
            document.getElementById("e6").innerHTML= "Password Must Contain 8 Char Required";
            document.getElementById("e1").innerHTML= "";
            document.getElementById("e3").innerHTML= "";
            document.getElementById("e4").innerHTML= "";
            document.getElementById("e5").innerHTML= "";
            document.getElementById("e2").innerHTML= "";
            return false;
        }
         else if (pass.length > 50) {
            return flase;
        } 
        else if (pass.search(/\d/) == -1)
        {
            document.getElementById("e6").innerHTML= "Password Must Contain 1 Number Required";
            document.getElementById("e1").innerHTML= "";
            document.getElementById("e3").innerHTML= "";
            document.getElementById("e4").innerHTML= "";
            document.getElementById("e5").innerHTML= "";
            document.getElementById("e2").innerHTML= "";
            return false;
        }
         else if (str.search(/[a-zA-Z]/) == -1) 
         {
            document.getElementById("e6").innerHTML= "Password Must Contain mul leter Required";
            document.getElementById("e1").innerHTML= "";
            document.getElementById("e3").innerHTML= "";
            document.getElementById("e4").innerHTML= "";
            document.getElementById("e5").innerHTML= "";
            document.getElementById("e2").innerHTML= "";
            return false;
        } else if (str.search(/[^a-zA-Z0-9!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?]/) == -1) {
            document.getElementById("e6").innerHTML= "Password Must Contain Speacial leter Required";
            document.getElementById("e1").innerHTML= "";
            document.getElementById("e3").innerHTML= "";
            document.getElementById("e4").innerHTML= "";
            document.getElementById("e5").innerHTML= "";
            document.getElementById("e2").innerHTML= "";
            return false;
        }
        else
            {
                return true;
            }
    
    }
s
    else
    {
        return true;
    }
        
    
}


