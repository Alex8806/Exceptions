public class DataInput implements DataTaker {
    public Entry Input() throws Exception {
        try {
            Entry entry = new Entry();
            String en = this.DataInput();
            String[] entr = en.split(" ");

            if (this.CheckTExtNoNumber(entr[0])) {
                entry.setSurname(entr[0]);
            } else {
                throw new CustomException(" Запрещеннный символ в фамилии");
            }
            if (this.CheckTExtNoNumber(entr[1])) {
                entry.setName(entr[1]);
            } else {
                throw new CustomException(" Запрещеннный символ в имени");
            }
            if (this.CheckTExtNoNumber(entr[2])) {
                entry.setFathername(entr[2]);
            } else {
                throw new CustomException(" Запрещеннный символ в отчестве");
            }
            entry.setDob(new DOB(entr[3]));
            entry.setPhone(Integer.parseInt(entr[4]));
            if ((entr[5].length() != 1) || ((entr[5].charAt(0) != 'f') && (entr[5].charAt(0) != 'm'))) {
                throw new CustomException("О шибка в написании пола");
            } else {
                entry.setSex(entr[5].charAt(0));
            }
           if(entr.length > 6) {
                throw new CustomException(" Слишком много ты ввел. Не надо столько....");
            }
            return entry;
        } catch (IndexOutOfBoundsException e) {
            throw new CustomException(e.getMessage() + " Вы ввели не все поля");
        } catch (NumberFormatException e) {
            throw new CustomException(e.getMessage() + " Кажется... Ошибка в номере телефона. Я почти уверен.");
        }
        catch (Exception e){
            throw new CustomException(e.getMessage() + " Еще одна ошибка");
        }
    }
}
