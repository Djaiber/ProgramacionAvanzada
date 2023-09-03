document.addEventListener("DOMContentLoaded", function() {
    // Get a reference to the file input element
    const cvImageInput = document.getElementById('cv_image');

    // Add an event listener to the file input
    cvImageInput.addEventListener('change', function(event) {
      // Get the selected file
      const selectedFile = event.target.files[0];

      // Get a reference to the image preview element
      const imagePreview = document.getElementById('image_preview');

      // Check if a file was selected
      if (selectedFile) {
        // Display the selected image in the preview
        const reader = new FileReader();
        reader.onload = function() {
          imagePreview.src = reader.result;
        };
        reader.readAsDataURL(selectedFile);

        // Disable the input to prevent further uploads
        cvImageInput.disabled = true;
      }
    });
  });