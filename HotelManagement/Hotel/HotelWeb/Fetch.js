
    // JavaScript code to use fetch API

// The data you want to send as query parameters


// Sending a GET request using fetch API
fetch(`http://localhost:8010/dapi/getp`, {
    method: 'GET', // GET request
    headers: {
        'Content-Type': 'application/json', // The content type of the request
    }
})
.then(response => {
    if (!response.ok) {
        throw new Error('Network response was not ok ' + response.statusText);
    }
    // console.log("data not found");
    return response.json(); // Parse the response as JSON
})
.then(data => {
    console.log('Success:', data); // Handle the response data
})
.catch((error) => {
    console.error('Error:', error); // Handle any errors
});


