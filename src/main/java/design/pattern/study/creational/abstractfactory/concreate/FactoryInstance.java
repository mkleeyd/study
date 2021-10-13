package design.pattern.study.creational.abstractfactory.concreate;

import design.pattern.study.creational.abstractfactory.abst02.Button;
import design.pattern.study.creational.abstractfactory.abst02.GuiFactory;
import design.pattern.study.creational.abstractfactory.abst02.TextArea;

/**
 * 라이브러리 구조로 만들어주기
 */
public class FactoryInstance {


    public static GuiFactory getGuiFactory() {

        switch (getOsCode()) {
            case 0:
                return new LinuxGuiFactory();
            case 1:
                return new MacGuiFactory();
            default:
                throw new Error("맞는 os 없음");
        }
    }

    private static int getOsCode() {
        if (System.getProperty("os.name").equals("Linux Ubuntu 20.04LTS")) {
            return 0;
        }
        else if (System.getProperty("os.name").equals("Mac OS X")) {
            return 1;
        }
        else{
            return 100;
        }
    }
}/////

class LinuxGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}/////

class LinuxButton implements Button {

    @Override
    public void click() {
        System.out.println("리눅스 버튼 클릭");
    }
}/////


class LinuxTextArea implements TextArea {

    @Override
    public String getText() {
        return "리눅스 텍스트 에어리어";
    }
}/////


class MacGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea createTextArea() {
        return new MacTextArea();
    }
}/////

class MacButton implements Button {

    @Override
    public void click() {
        System.out.println("Mac 버튼 클릭");
    }
}/////

class MacTextArea implements TextArea {

    @Override
    public String getText() {
        return "Mac 텍스트 에어리어";
    }
}/////



