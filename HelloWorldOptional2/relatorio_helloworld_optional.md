# Tutorial 1 -- Hello World Optional Android Application

Course: Computação Móvel\
Student(s): Rodrigo Simões\
Date: 2026\
Repository URL: https://github.com/SEU_REPOSITORIO

------------------------------------------------------------------------

# 1. Introduction

Este projeto corresponde a uma versão opcional da aplicação **Hello
World** desenvolvida em Android utilizando **Kotlin**.

O objetivo principal deste exercício é reforçar os conhecimentos
adquiridos durante o desenvolvimento da primeira aplicação Android,
aprofundando o contacto com o ambiente **Android Studio**, com a
linguagem **Kotlin** e com a estrutura típica de um projeto Android.

Os objetivos deste trabalho incluem:

-   compreender melhor a estrutura de um projeto Android
-   trabalhar com **Kotlin** no desenvolvimento de aplicações móveis
-   executar e testar aplicações num emulador Android
-   reforçar a ligação entre **código Kotlin** e **layouts XML**

------------------------------------------------------------------------

# 2. System Overview

A aplicação consiste numa aplicação Android simples cuja finalidade é
demonstrar o funcionamento básico de uma aplicação móvel.

### Funcionalidades principais

-   iniciar aplicação Android
-   carregar interface gráfica
-   apresentar mensagem ao utilizador

### Caso de uso

1.  O utilizador abre a aplicação.
2.  A aplicação inicia a **MainActivity**.
3.  O layout definido em XML é carregado.
4.  A aplicação apresenta a mensagem no ecrã.

------------------------------------------------------------------------

# 3. Architecture and Design

A aplicação segue a arquitetura padrão utilizada em projetos Android.

### Estrutura principal do projeto

app/ ├── java/ │ └── com.example.helloworldoptional │ └──
MainActivity.kt │ ├── res/ │ ├── layout/ │ │ └── activity_main.xml │ │ │
├── values/ │ │ ├── strings.xml │ │ ├── colors.xml │ │ └── themes.xml │
└── AndroidManifest.xml

### Componentes principais

**MainActivity.kt**\
Responsável por iniciar a aplicação e carregar o layout.

**activity_main.xml**\
Define a interface gráfica da aplicação.

**AndroidManifest.xml**\
Contém as configurações principais da aplicação Android.

------------------------------------------------------------------------

# 4. Implementation

### MainActivity.kt

``` kotlin
package com.example.helloworldoptional

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
```

### activity_main.xml

``` xml
<TextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Hello World Optional!"
    android:textSize="24sp"/>
```

------------------------------------------------------------------------

# 5. Testing and Validation

A aplicação foi testada utilizando o **Android Emulator**
disponibilizado pelo Android Studio.

### Procedimento de teste

1.  Abrir o projeto no Android Studio
2.  Compilar o projeto
3.  Executar a aplicação no emulador
4.  Verificar se a interface aparece corretamente

Resultado esperado:

A aplicação inicia corretamente e apresenta a mensagem definida no
layout.

------------------------------------------------------------------------

# 6. Usage Instructions

### Requisitos

-   Android Studio
-   Java Development Kit (JDK)
-   Android Emulator configurado

### Execução

1.  Abrir o projeto no Android Studio
2.  Selecionar um dispositivo virtual
3.  Clicar em **Run**
4.  A aplicação será executada automaticamente

------------------------------------------------------------------------

# Autonomous Software Engineering Section

## 7. Prompting Strategy

Durante o desenvolvimento deste projeto foram utilizadas ferramentas de
apoio baseadas em **Inteligência Artificial**, nomeadamente para
esclarecer dúvidas relacionadas com Kotlin e Android Studio.

------------------------------------------------------------------------

## 8. Autonomous Agent Workflows

Ferramentas de IA auxiliaram principalmente em:

-   explicação de conceitos de Kotlin
-   identificação de erros
-   apoio na organização do relatório

------------------------------------------------------------------------

## 9. Verification of AI-Generated Artifacts

Todo o conteúdo gerado foi revisto manualmente e validado através de
testes no Android Studio.

------------------------------------------------------------------------

## 10. Human vs AI Contribution

### Contribuição humana

-   criação e configuração do projeto Android
-   implementação da aplicação
-   execução e testes

### Contribuição da IA

-   apoio na organização do relatório
-   esclarecimento de dúvidas técnicas

------------------------------------------------------------------------

## 11. Ethical and Responsible Use

A utilização de ferramentas de IA foi realizada apenas como suporte
educativo.

------------------------------------------------------------------------

# Development Process

## 12. Version Control

O projeto foi versionado utilizando **Git** e armazenado num repositório
**GitHub**.

------------------------------------------------------------------------

## 13. Difficulties and Lessons Learned

As principais dificuldades encontradas foram:

-   configuração inicial do ambiente Android
-   execução correta da aplicação no emulador
-   compreensão da estrutura de um projeto Android

------------------------------------------------------------------------

## 14. Future Improvements

Possíveis melhorias incluem:

-   adicionar novas funcionalidades à aplicação
-   melhorar a interface gráfica
-   adicionar navegação entre diferentes ecrãs

------------------------------------------------------------------------

## 15. AI Usage Disclosure

Ferramenta utilizada:

-   ChatGPT

A ferramenta foi utilizada apenas para apoio na explicação de conceitos
e organização do relatório.
