document.addEventListener("DOMContentLoaded", function () {
  const tabs = document.querySelectorAll("nav[role='tablist'] button[role='tab']");
  const tabContents = document.querySelectorAll(".tab-content");

  function setActiveTab(tabName) {
    tabContents.forEach((section) => {
      if (section.id === tabName) {
        section.classList.remove("hidden");
      } else {
        section.classList.add("hidden");
      }
    });

    tabs.forEach((tab) => {
      if (tab.dataset.tab === tabName) {
        tab.setAttribute("aria-selected", "true");
        tab.classList.remove("text-gray-500");
        tab.classList.add("text-white");
      } else {
        tab.setAttribute("aria-selected", "false");
        tab.classList.remove("text-white");
        tab.classList.add("text-gray-500");
      }
    });
  }

  tabs.forEach((tab) => {
    tab.addEventListener("click", () => {
      setActiveTab(tab.dataset.tab);
    });
  });

  // Initialize with home tab active
  setActiveTab("home");
});
