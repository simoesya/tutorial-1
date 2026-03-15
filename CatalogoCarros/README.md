# Tutorial 1 -- Hello Kotlin. Hello Mobile Android World!

Course: Computação Móvel\
Student(s): Rodrigo Simões\
Date: 2026\
Repository URL: https://github.com/SEU_REPOSITORIO

------------------------------------------------------------------------

# 1. Introduction

## Purpose of the assignment, problem description, and objectives

Este trabalho tem como objetivo introduzir os conceitos fundamentais do
desenvolvimento de aplicações móveis Android utilizando **Kotlin** e
**Android Studio**.

O projeto consiste na criação de uma aplicação simples que demonstra a
estrutura básica de uma aplicação Android, incluindo:

-   criação de projeto Android
-   utilização de **Kotlin**
-   criação de **layouts XML**
-   execução da aplicação em **emulador Android**

O principal objetivo é compreender o funcionamento inicial do ambiente
de desenvolvimento Android e aprender os passos necessários para criar,
compilar e executar uma aplicação móvel.

------------------------------------------------------------------------

# 2. System Overview

## High-level description of the solution, main features, and use cases

A aplicação desenvolvida consiste numa aplicação Android simples
denominada **Hello Kotlin App**.

A aplicação apresenta uma interface simples que contém:

-   um **TextView**
-   uma mensagem de boas-vindas

### Funcionalidades principais

-   Mostrar mensagem na interface gráfica
-   Demonstrar a ligação entre **Kotlin** e **XML Layout**
-   Executar aplicação num dispositivo virtual Android

### Caso de uso principal

Utilizador abre a aplicação → aplicação mostra mensagem **Hello Kotlin /
Hello Mobile Android World**

------------------------------------------------------------------------

# 3. Architecture and Design

## Architecture, folder structure, design patterns, and justification of key decisions

A aplicação segue a arquitetura padrão de projetos Android.

### Estrutura principal do projeto

app/ ├── java/ │ └── com.example.hellokotlin │ └── MainActivity.kt │ ├──
res/ │ ├── layout/ │ │ └── activity_main.xml │ │ │ ├── values/ │ │ ├──
strings.xml │ │ ├── colors.xml │ │ └── themes.xml │ └──
AndroidManifest.xml

### Componentes principais

**MainActivity.kt**

Responsável por iniciar a aplicação e carregar o layout.

**activity_main.xml**

Define a interface gráfica apresentada ao utilizador.

**AndroidManifest.xml**

Define a configuração da aplicação Android.

------------------------------------------------------------------------

# 4. Implementation

## Implementation details: main modules, components, algorithms, and relevant code excerpts

### MainActivity.kt

Este ficheiro contém o código Kotlin responsável por iniciar a
aplicação.

``` kotlin
package com.example.hellokotlin

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
    android:text="Hello Kotlin!"
    android:textSize="24sp"/>
```

------------------------------------------------------------------------

# 5. Testing and Validation

A aplicação foi testada utilizando o **Android Emulator (Pixel 9 Pro)**.

### Passos de teste

1.  Compilar o projeto no Android Studio
2.  Executar a aplicação no emulador
3.  Confirmar que a interface aparece corretamente
4.  Confirmar que o texto é apresentado

------------------------------------------------------------------------

# 6. Usage Instructions

### Requisitos

-   Android Studio
-   JDK instalado
-   Android Emulator

### Passos para executar

1.  Abrir o projeto no Android Studio
2.  Esperar que o Gradle faça o build do projeto
3.  Selecionar um **Android Emulator**
4.  Clicar em **Run**
5.  A aplicação será executada automaticamente

------------------------------------------------------------------------

# Autonomous Software Engineering Section

## 7. Prompting Strategy

Durante o desenvolvimento foram utilizadas ferramentas de apoio baseadas
em **Inteligência Artificial**, incluindo ChatGPT.

Estas ferramentas foram utilizadas para esclarecer dúvidas, compreender
erros de compilação e obter exemplos de código.

------------------------------------------------------------------------

## 8. Autonomous Agent Workflows

Ferramentas de IA auxiliaram no suporte ao desenvolvimento,
nomeadamente:

-   explicação de conceitos
-   auxílio na resolução de erros
-   apoio na estruturação do relatório

------------------------------------------------------------------------

## 9. Verification of AI-Generated Artifacts

Todos os conteúdos gerados por IA foram verificados manualmente antes da
utilização final.

------------------------------------------------------------------------

## 10. Human vs AI Contribution

### Contribuição humana

-   criação do projeto Android
-   implementação da aplicação
-   execução e testes
-   organização do repositório

### Contribuição da IA

-   apoio na explicação de conceitos
-   ajuda na organização do relatório

------------------------------------------------------------------------

## 11. Ethical and Responsible Use

A utilização de ferramentas de IA foi feita apenas como suporte ao
desenvolvimento.

------------------------------------------------------------------------

# Development Process

## 12. Version Control and Commit History

Foi utilizado **Git** para controlo de versões e o projeto foi publicado
no **GitHub**.

------------------------------------------------------------------------

## 13. Difficulties and Lessons Learned

Foram encontradas algumas dificuldades iniciais relacionadas com:

-   configuração do Android Studio
-   execução da aplicação no emulador
-   compreensão da estrutura do projeto Android

Estas dificuldades contribuíram para a aprendizagem do ambiente Android.

------------------------------------------------------------------------

## 14. Future Improvements

Possíveis melhorias futuras:

-   adicionar novas interfaces
-   adicionar navegação entre ecrãs
-   incluir imagens e layouts mais avançados
-   implementar funcionalidades adicionais

------------------------------------------------------------------------

## 15. AI Usage Disclosure (Mandatory)

Ferramenta utilizada:

-   ChatGPT

A ferramenta foi utilizada apenas como apoio à explicação de conceitos e
estruturação do relatório.
