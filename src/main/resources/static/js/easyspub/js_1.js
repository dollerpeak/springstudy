

heading.onclick = function () {
    let heading = document.querySelector("#heading");
    let color = heading.style.color;
    if (color == "red") {
        heading.style.color = "blue";
    } else {
        heading.style.color = "red";
    }

    //console.log(typeof color);
}



