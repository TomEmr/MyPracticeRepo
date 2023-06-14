const p = document.querySelector('p');
document.querySelector('form')
    .addEventListener('submit', (ev) => {
        ev.preventDefault();
        const formData = new FormData(ev.target);
        const data = Object.fromEntries(formData);

        fetch("/api/links", {
            method: 'POST',
            header: {
                'Content-type': 'Application:json'
            },
            body: JSON.stringify(data)
        })
            .then(response => {
                p.innerText = '';
                // const body = response.json();
                if (response.status === 400){
                    // příjde mi z backendu kde mám Error s fieldem message
                    throw new Error(response.json().message)
                } else {
                    return response.json();
                }
            })
            .then (json => {
                p.innerText = json.alias;
                ev.target.reset();
            })
            .catch(error => {
                p.innerText = error.message;
            })
    })