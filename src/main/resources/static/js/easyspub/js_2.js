document.addEventListener("DOMContentLoaded", function () {
    console.log("DOMContentLoaded");
})

window.onload = function () {
    console.log("window.onload");

    init();
    randomColor();
}

window.onunload = function () {
    console.log("window.onunload");
}

function init() {
    //
}

function random(nNum) {
    return Math.floor(Math.random() * nNum);
}

function randomColor() {
    let rgb = "rgb(" + random(256) + "," + random(256) + "," + random(256) + ")";
    document.body.style.backgroundColor = rgb;
}

