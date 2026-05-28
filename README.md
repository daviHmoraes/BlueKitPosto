<div align="center">

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=32&duration=3000&pause=1000&color=0EA5E9&center=true&vCenter=true&width=500&lines=%E2%9B%BD+BlueKitPosto;Sistema+de+Posto;em+Java+MVC" alt="BlueKitPosto" />

<br/>

![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em%20desenvolvimento-0EA5E9?style=for-the-badge)
![Arquitetura](https://img.shields.io/badge/Arquitetura-MVC-6366F1?style=for-the-badge)
![Licença](https://img.shields.io/badge/Licença-MIT-22C55E?style=for-the-badge)

<br/>

> **Sistema de gerenciamento de posto de combustível em Java puro**  
> Desenvolvido para praticar arquitetura MVC e orientação a objetos do jeito certo.

</div>

---

## 🎯 O que será o projeto

O **BlueKitPosto** simulará o fluxo operacional completo de um posto de combustível:

```
🔫 Bombas        →   controle de status e tipo de combustível
⛽ Abastecimento →   registro por litros ou por valor, com cálculo automático
💰 Caixa         →   pagamento, troco e fechamento de turno
📦 Estoque       →   alertas de nível baixo e reabastecimento de tanque
👤 Acesso        →   permissões por cargo (Frentista, Caixa, Gerente)
📊 Relatórios    →   vendas por período e resumo financeiro do turno
```

---

## 🏗️ Arquitetura MVC

```
src/
├── 📁 model/
│   ├── entity/        # Entidades do domínio
│   ├── enums/         # Tipos, status e formas de pagamento
│   ├── exceptions/    # Exceções customizadas
│   └── repository/    # Persistência em memória (ArrayList)
│
├── 📁 controller/     # Regras operacionais e coordenação
│
└── 📁 view/           # Interface via console (menus e entradas)
```

---

## 🛠️ Tecnologias

| Tecnologia | Uso |
|---|---|
| **Java 17** | Linguagem principal |
| **BigDecimal** | Cálculos monetários sem perda de precisão |
| **LocalDateTime** | Controle de data/hora das vendas |
| **ArrayList / HashMap** | Persistência em memória |

---

## 🌿 Branches

| Branch | Finalidade |
|---|---|
| `main` | Código estável |
| `develop` | Integração das features |
| `feature/*` | Novas funcionalidades |
| `fix/*` | Correção de bugs |

---

<div align="center">

🚧 **Projeto em desenvolvimento ativo** 🚧

</div>
