document.addEventListener("DOMContentLoaded", function() {
  const menuToggle = document.getElementById("toggle");
  const navbar = document.getElementById("navbar");

  menuToggle.addEventListener("click", function() {
    navbar.classList.toggle("show");
  });
});