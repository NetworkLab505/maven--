function CheckClass(){

    var idValue=document.getElementById("classID").value;
    var cValue=document.getElementById("classname").value;
    var sValue=document.getElementById("speaker").value;
    if(idValue=="")
    {
        document.getElementById("IDspan").innerHTML="<font color='red'>请填写ID!</font>";
        return false;
    }
    else
    {
        document.getElementById("IDspan").innerHTML="";
    }
    if(cValue=="")
    {
        document.getElementById("classspan").innerHTML="<font color='red'>课程名称不能为空！</font>";
        return false;
    }
    else
    {
        document.getElementById("classspan").innerHTML="";
    }
    if(sValue=="")
    {
        document.getElementById("speakspan").innerHTML="<font color='red'>请输入主讲人！</font>";
        return false;
    }
    else
    {
        document.getElementById("speakspan").innerHTML="";
    }
    
    close();
}
function close() {
    $('#adclass').window('close');
    submitclass();
}
function submitclass(){
    var Id = document.getElementById("classID").value;
    var Learning_direction=document.getElementById("direction").value;
    var Grade=document.getElementById("grade1").value;
    var Course_name= document.getElementById("classname").value;
    var Keynote_speaker=document.getElementById("speaker").value;
    var Clicks=document.getElementById("clicknum").value;
    var Uploadtime = document.getElementById("datepicker").value;
    row = document.getElementById("table").insertRow();
    if(row!=null){
        cell=row.insertCell();
        cell.innerHTML=Id;
        cell = row.insertCell();
        cell.innerHTML=Learning_direction;
        cell = row.insertCell();
        cell.innerHTML=Grade;
        cell=row.insertCell();
        cell.innerHTML=Course_name;
        cell = row.insertCell();
        cell.innerHTML=Keynote_speaker;
        cell = row.insertCell();
        cell.innerHTML=Clicks;
        cell = row.insertCell();
        cell.innerHTML=Uploadtime;
        cell = row.insertCell();
        cell.innerHTML='<button class="btn btn-link" onclick="del(this)">删除</button>';
        cell = row.insertCell();
        cell.innerHTML='<button class="btn btn-link" onclick="$(\'#w\').window(\'open\'); modify(this) ">编辑</button>';

    }
    return false;
}