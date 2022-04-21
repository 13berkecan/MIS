function getDateTime () {
    let datentime = new Date();
    let date = datentime.toLocaleDateString("en-US", {weekday: "short", month: "short", day: "numeric" });
    let time = datentime.toLocaleTimeString("en-Us", {hour12: false, hour: "2-digit", minute: "2-digit"})
    document.getElementById("date").innerHTML=date;
    document.getElementById("time").innerHTML=time;
}