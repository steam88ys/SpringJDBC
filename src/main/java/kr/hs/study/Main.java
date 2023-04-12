package kr.hs.study;

import kr.hs.study.config.BeanConfig;
import kr.hs.study.dao.TestDAO;
import kr.hs.study.dto.TestBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        TestDAO dao = ctx.getBean(TestDAO.class);

        // 데이터를 저장할 빈 생성 (TestBean1)
        TestBean1 t = new TestBean1();
        t.setData1(1);
        t.setData2("spring1");
        dao.insert(t);
        System.out.println("Inserted!!!!");

        ctx.close();

    }
}