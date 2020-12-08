package com.vbuciuc;

import junit.framework.Test;
import junit.framework.TestCase;
import lombok.Builder;
import lombok.Getter;
import lombok.val;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    @Builder
    @Getter
    public static class OrderedFields
    {
        private String name;
        private String kind;
    }

    public void testOrderedFields() {
        val name = "THIS IS THE NAME";
        val kind = "THIS IS THE KIND";

        val builder = OrderedFields
            .builder()
            .name("THIS IS THE NAME")
            .kind("THIS IS THE KIND");

        val res = builder.build();

        assertThat(res.getName()).isEqualTo(name);
        assertThat(res.getKind()).isEqualTo(kind);
    }

    @Builder
    @Getter
    public static class OrderedFieldsWrongOrderConstructor
    {
        private String name;
        private String kind;


        public OrderedFieldsWrongOrderConstructor(final String kind, final String name) {
            this.kind = kind;
            this.name = name;
        }
    }

    public void testOrderedFieldsWrongOrderConstructor() {
        val name = "THIS IS THE NAME";
        val kind = "THIS IS THE KIND";

        val builder = OrderedFieldsWrongOrderConstructor
            .builder()
            .name("THIS IS THE NAME")
            .kind("THIS IS THE KIND");

        val res = builder.build();

        assertThat(res.getName()).isEqualTo(name);
        assertThat(res.getKind()).isEqualTo(kind);
    }

    @Builder
    @Getter
    public static class OrderedFieldsRightOrderConstructor
    {
        private String name;
        private String kind;

        public OrderedFieldsRightOrderConstructor(final String name, final String kind) {
            this.kind = kind;
            this.name = name;
        }
    }

    
    public void testOrderedFieldsRightOrderConstructor() {
        val name = "THIS IS THE NAME";
        val kind = "THIS IS THE KIND";

        val builder = OrderedFieldsRightOrderConstructor
            .builder()
            .name("THIS IS THE NAME")
            .kind("THIS IS THE KIND");

        val res = builder.build();

        assertThat(res.getName()).isEqualTo(name);
        assertThat(res.getKind()).isEqualTo(kind);
    }

    @Getter
    public static class OrderedFieldsWrongOrderConstructorAnnotationOnConstructor
    {
        private String name;
        private String kind;

        @Builder
        public OrderedFieldsWrongOrderConstructorAnnotationOnConstructor(final String name, final String kind) {
            this.kind = kind;
            this.name = name;
        }
    }

    public void testOrderedFieldsWrongOrderConstructorAnnotaionOnConstructor() {
        val name = "THIS IS THE NAME";
        val kind = "THIS IS THE KIND";

        val builder = OrderedFieldsWrongOrderConstructorAnnotationOnConstructor
            .builder()
            .name("THIS IS THE NAME")
            .kind("THIS IS THE KIND");

        val res = builder.build();

        assertThat(res.getName()).isEqualTo(name);
        assertThat(res.getKind()).isEqualTo(kind);
    }    
}
