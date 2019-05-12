const http = require('http')
const porta = 3000

const server = http.createServer((request, response) => {
  if (request.url == '/status') {
    response.status = 200;
    response.end('OK')
  }
})

server.listen(porta, () => {
  console.log(`Servidor iniciado na porta ${porta}`)
})