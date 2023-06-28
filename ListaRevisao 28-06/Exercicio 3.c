#include <stdio.h>

void removerElementosPares(No** inicio) {
    if (*inicio == NULL) {
        return;
    }

    No* atual = *inicio;
    No* anterior = NULL;

    while (atual != NULL) {
        if (atual->dado % 2 == 0) {
            if (anterior == NULL) {
                *inicio = atual->proximo;
                free(atual);
                atual = *inicio;
            } else {    
                anterior->proximo = atual->proximo;
                free(atual);
                atual = anterior->proximo;
            }
        } else {
            anterior = atual;
            atual = atual->proximo;
        }
    }
}
