export function setToken(token) {
    localStorage.setItem("access_token",token)
}

export function getToken(token) {
    return localStorage.getItem("access_token");
}

export function clearToken() {
    localStorage.removeItem("access_token");
}