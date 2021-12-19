document.addEventListener('DOMContentLoaded', function()
{
    var copyButton = document.getElementById("copy");
    if (copyButton)
    {
        copyButton.addEventListener('click', function()
        {
 			  var copyText = document.getElementById("shortURL");
			  copyText.select();
			  navigator.clipboard.writeText(copyText.value);
			  alert("Copied Short URL: " + copyText.value);
        });
    }
});