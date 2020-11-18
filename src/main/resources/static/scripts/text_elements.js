/*Scrolls to option on click for more options */
function onCarClick(){
  document.getElementById("carOption").scrollIntoView({behavior: "smooth", block: "center", inline: "nearest"});
}

function onCarpoolClick(){
  document.getElementById("carpoolOption").scrollIntoView({behavior: "smooth", block: "center", inline: "nearest"});
}

function onBusClick(){
  document.getElementById("busOption").scrollIntoView({behavior: "smooth", block: "center", inline: "nearest"});
}

function onShuttleClick(){
  document.getElementById("shuttleOption").scrollIntoView({behavior: "smooth", block: "center", inline: "nearest"});
}

function onBikeClick(){
  document.getElementById("bikeOption").scrollIntoView({behavior: "smooth", block: "center", inline: "nearest"});
}

function onWalkClick(){
  document.getElementById("walkOption").scrollIntoView({behavior: "smooth", block: "center", inline: "nearest"});
}


var timeoutID;
var y;
window.addEventListener("scroll", function (){
  changeRank();
});

function changeRank(){
  y = window.pageYOffset;
  if(y > 200) {
    document.getElementById("rankBar1").className = "rankBarSmall";
  }
  else{
    document.getElementById("rankBar1").className = "rankBar";
  }
}