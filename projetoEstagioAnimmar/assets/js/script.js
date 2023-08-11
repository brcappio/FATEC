var item1 = document.getElementById("item1");
var item2 = document.getElementById("item2");
var item3 = document.getElementById("item3");
var item4 = document.getElementById("item4");
var card2 = document.getElementById("card2");
var card3 = document.getElementById("card3");
var card4 = document.getElementById("card4");


function toggleColor1() {
    
    item1.classList.toggle("item-active");
    item2.classList.remove("item-active");
    item3.classList.remove("item-active");
    card2.classList.toggle("card-not-active");
    card3.classList.add("card-not-active");
    card4.classList.add("card-not-active");
    
}

item1.addEventListener('click', toggleColor1);



function toggleColor2() {
    
    item2.classList.toggle("item-active");
    card3.classList.toggle("card-not-active");
    card4.classList.add("card-not-active");
    item3.classList.remove("item-active");

    
}

item2.addEventListener('click', toggleColor2);



function toggleColor3() {
    
    item3.classList.toggle("item-active");
    card4.classList.toggle("card-not-active");
    item4.classList.remove("item-active");
    
}

item3.addEventListener('click', toggleColor3);



function toggleColor4() {
    
    item4.classList.toggle("item-active");
    
}

item4.addEventListener('click', toggleColor4);