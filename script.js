document.addEventListener("DOMContentLoaded", () => {
  // --- Mobile Navigation Toggle ---
  const menuToggle = document.getElementById("menu-toggle");
  const navMenu = document.getElementById("nav-menu");
  const navLinks = document.querySelectorAll(".nav-link");

  // Toggle menu open/close
  menuToggle.addEventListener("click", () => {
    navMenu.classList.toggle("active");
    // Optional: Animate hamburger lines into an 'X'
    menuToggle.classList.toggle("active");
  });

  // Close menu when a link is clicked
  navLinks.forEach((link) => {
    link.addEventListener("click", () => {
      navMenu.classList.remove("active");
      menuToggle.classList.remove("active");
    });
  });

  // --- Contact Form Submission ---
  const contactForm = document.getElementById("contact-form");
  const btn = document.querySelector("button[type='submit']");

  if (contactForm) {
    contactForm.addEventListener("submit", async (e) => {
      e.preventDefault();

      // 🔴 Prevent multiple clicks
      btn.disabled = true;
      btn.innerText = "Sending...";

      const data = {
        name: document.getElementById("name").value,
        email: document.getElementById("email").value,
        message: document.getElementById("message").value,
      };

      try {
        await fetch(
          "https://script.google.com/macros/s/AKfycbw86bQAqcCbcnhE7LbV_za4TymWRU41by8Plr6wM648TZ-io39-X7ar0Huvh2YsrLoc/exec",
          {
            method: "POST",
            body: JSON.stringify(data),
          },
        );

        alert("Message sent successfully!");
        contactForm.reset();
      } catch (error) {
        alert("Error sending message");
        console.error(error);
      } finally {
        // ✅ Enable button again
        btn.disabled = false;
        btn.innerText = "Send Message";
      }
    });
  }

  // --- Navbar Scroll Effect ---
  const navbar = document.getElementById("navbar");
  window.addEventListener("scroll", () => {
    if (window.scrollY > 50) {
      navbar.style.boxShadow = "0 2px 10px rgba(0, 0, 0, 0.1)";
    } else {
      navbar.style.boxShadow = "none";
    }
  });
});
