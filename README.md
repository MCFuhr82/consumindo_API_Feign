# Projeto de uma API REST com SPRINGBOOT para consumo de uma API externa usando annotation Feign

Projeto para o GFT Starter 3, em parceria com a DIO. Consumindo API com Feign.

A API gratuita BoredAPI - https://www.boredapi.com/ - que traz uma atividade randômica para você fazer caso esteja entediado.
O JSON da API externa é:

```
{
  "activity": "Bake something you've never tried before",
  "type": "cooking",
  "participants": 1,
  "price": 0.4,
  "link": "",
  "key": "5665663",
  "accessibility": 0.3
}
```
Porém, a API que está consumindo foi estruturada para receber apenas os campos:

```
{
  "activity": "Bake something you've never tried before",
  "type": "cooking",
  "participants": 1
 }
```

## Os objetivos do projeto são:
- Criar API Rest usando Springboot Java
- Consumir API externa usando método HTTP GET
- Implementar padrão de projeto
- Estrutura camadas lógicas: controller, model e service

### Conhecimento e experiência adquirida:

👍 Criar API

👍 Consumir API externa

👍 Ferramentas utilizadas: Spring Boot, Maven, Postman, IntelliJ, Spring Initializer

👍 Padrão de projetos

👍 Usar dependência Feign
