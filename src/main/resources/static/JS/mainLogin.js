const signUpButton = document.getElementById('signUp');
const signInButton = document.getElementById('signIn');
const container = document.getElementById('container');

signUpButton.addEventListener('click', () => {
    const nextURL = '/register';
    const nextTitle = 'Register';
    const nextState = { additionalInformation: 'Updated the URL with JS' };

    // This will create a new entry in the browser's history, without reloading
    window.history.pushState(nextState, nextTitle, nextURL);

    // This will replace the current entry in the browser's history, without reloading
    window.history.replaceState(nextState, nextTitle, nextURL);
	container.classList.add("right-panel-active");
});

signInButton.addEventListener('click', () => {
    // Current URL: https://my-website.com/page_a
    const nextURL = '/login';
    const nextTitle = 'Login';
    const nextState = { additionalInformation: 'Updated the URL with JS' };

    // This will create a new entry in the browser's history, without reloading
    window.history.pushState(nextState, nextTitle, nextURL);

    // This will replace the current entry in the browser's history, without reloading
    window.history.replaceState(nextState, nextTitle, nextURL);
	container.classList.remove("right-panel-active");
});


//url
    var up = document.getElementById('GFG_UP');
    var url = new URL("https://www.geeksforgeeks.org");
    up.innerHTML = url;
    var down = document.getElementById('GFG_DOWN');

    function GFG_Fun() {
        url.searchParams.append('param_1', 'val_1');
        down.innerHTML = url;
    }