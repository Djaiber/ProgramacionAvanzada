function previewImage(event) {
    const preview = document.getElementById('image_preview');
    const file = event.target.files[0];
    const reader = new FileReader();

    reader.onload = function() {
      preview.src = reader.result;
    }

    if (file) {
      reader.readAsDataURL(file);
      
    }
  }