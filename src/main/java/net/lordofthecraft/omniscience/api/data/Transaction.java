package net.lordofthecraft.omniscience.api.data;

import com.google.common.base.MoreObjects;

import java.util.Objects;

public class Transaction<T> {

    private final T originalState;
    private final T finalState;

    public Transaction(T originalState, T finalState) {
        this.originalState = originalState;
        this.finalState = finalState;
    }

    public T getOriginalState() {
        return originalState;
    }

    public T getFinalState() {
        return finalState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction<?> that = (Transaction<?>) o;
        return Objects.equals(originalState, that.originalState) &&
                Objects.equals(finalState, that.finalState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originalState, finalState);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("originalState", originalState)
                .add("finalState", finalState)
                .toString();
    }
}
