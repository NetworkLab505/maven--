function CheckVideo(){

    var idValue=document.getElementById("classID").value;
    var pValue=document.getElementById("videoname").value;
    if(idValue=="")
    {
        document.getElementById("IDspan").innerHTML="<font color='red'>请填写ID!</font>";
        return false;
    }
    else
    {
        document.getElementById("IDspan").innerHTML="";
    }
    if(pValue=="")
    {
        document.getElementById("namespan").innerHTML="<font color='red'>视频名不能为空！</font>";
        return false;
    }
    else
    {
        document.getElementById("namespan").innerHTML="";
    }
    close();
}
function close() {
    $('#addvideos').window('close');
    submitvideo();
}
function submitvideo(){
    var Id = document.getElementById("classID").value;
    var Learning_direction=document.getElementById("direction").value;
    var Video_Name= document.getElementById("videoname").value;
    var Video_Introduction=document.getElementById("introduce").value;
    var Video_address=document.getElementById("insertVideo").value;
    row = document.getElementById("table").insertRow();
    if(row!=null){
        cell=row.insertCell();
        cell.innerHTML=Id;
        cell = row.insertCell();
        cell.innerHTML=Learning_direction;
        cell = row.insertCell();
        cell.innerHTML=Video_Name;
        cell=row.insertCell();
        cell.innerHTML=Video_Introduction;
        cell = row.insertCell();
        cell.innerHTML=Video_address;
        cell = row.insertCell();
        cell.innerHTML='<button class="btn btn-link" onclick="del(this)">删除</button>';
        cell = row.insertCell();
        cell.innerHTML='<button class="btn btn-link" onclick="$(\'#w\').window(\'open\'); modify(this) ">编辑</button>';

    }
    return false;
}