async function getClinicInfo() {
    const response = await fetch('/clinic');
    const clinic = await response.json();
    document.getElementById('clinic-data').innerHTML = `
        <p>Name: ${clinic[0].name}</p>
        <p>Address: ${clinic[0].address}</p>
        <p>Phone: ${clinic[0].phone}</p>
        <p>Hours: ${clinic[0].hours}</p>
    `;
}
