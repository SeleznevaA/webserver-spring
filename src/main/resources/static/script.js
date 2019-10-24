function clickRandom() {
    var formData = new FormData(document.forms.random);

     fetch('/random', { method: 'POST', body: formData })
        .then(response => response.json())
        .then(response => document.getElementById("randomResult").innerHTML = "result: " + response.random);
}

function clickCounter() {
    var formData = new FormData(document.forms.counter);

     fetch('/counter', { method: 'POST', body: formData })
        .then(response => response.json())
        .then(response => document.getElementById("counterResult").innerHTML = "result: " + response.current);
}

function clickNewCounter() {
    fetch('/new-counter')
        .then(response => response)
        .then(response => {
            document.getElementById("counterResult").innerHTML = "result: ";
            document.getElementById("startValue").value = "";
            document.getElementById("counterValue").value = "";
        });
}