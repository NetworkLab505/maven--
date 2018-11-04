function CheckImg(){

    var cValue=document.getElementById("imgname").value;

    if(cValue=="")
    {
        document.getElementById("imgspan").innerHTML="<font color='red'>图片名称不能为空！</font>";
        return false;
    }
    else
    {
        document.getElementById("imgspan").innerHTML="";
    }

    close();
}
function close() {
    $('#addimages').window('close');
    submitimg();
}
function submitimg(){
    var Id = document.getElementById("classID").value;
    var Learning_direction=document.getElementById("direction").value;
    var Grade=document.getElementById("grade1").value;
    var Image_Name= document.getElementById("imgname").value;
    var Image=document.getElementById("insertImg").value;
    var Picture_Introduction=document.getElementById("introduce").value;
    row = document.getElementById("table").insertRow();
    if(row!=null){
        cell=row.insertCell();
        cell.innerHTML=Id;
        cell = row.insertCell();
        cell.innerHTML=Learning_direction;
        cell = row.insertCell();
        cell.innerHTML=Grade;
        cell=row.insertCell();
        cell.innerHTML=Image_Name;
        cell = row.insertCell();
        cell.innerHTML=Image;
        cell = row.insertCell();
        cell.innerHTML=Picture_Introduction;
        cell = row.insertCell();
        cell.innerHTML='<button class="btn btn-link" onclick="del(this)">删除</button>';
        cell = row.insertCell();
        cell.innerHTML='<button class="btn btn-link" onclick="$(\'#w\').window(\'open\'); modify(this) ">编辑</button>';

    }
    return false;
}


