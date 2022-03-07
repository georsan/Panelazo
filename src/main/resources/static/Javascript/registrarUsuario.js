async function obtenerdatos(){
datos=[];
datos.nombre=document.getElementById('nombre').value;
datos.apellido=document.getElementById('apellido').value;
datos.telefono=document.getElementById('telefono').value;
datos.email=document.getElementById('email').value;
datos.direccion=document.getElementById('direccion').value;
datos.password=document.getElementById('password').value;

const request = await fetch('http://localhost:8080/registrarUser', {
  method: 'POST',
  mode: 'no-cors',
  headers: {
    
    'Accept': 'application/json',
    'Content-Type': 'application/json'
  },
  body: JSON.stringify(datos)
});}