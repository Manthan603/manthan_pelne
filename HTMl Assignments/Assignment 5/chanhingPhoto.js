var imgArray = ["new_logo.png","panda.png", "illustration-logo.png", "nba.png"]
        
var i =0;
var img;
function display()
{
            
    document.getElementById("e1").src = imgArray[i]
    i++;
    if(i>=3)
    {
        i=0;
    }

}
var obj;
function startInterval()
{
    obj = setInterval("display()",1000);
}
function stopInterval()
{
    clearInterval(obj);
}