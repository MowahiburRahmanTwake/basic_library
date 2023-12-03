fun main() {
    val library = Library()

    while (true) {
        println("\nLibrary System Menu:")
        println("1. Add Books")
        println("2. Display all books")
        println("3. Search by author")
        println("4. Search by publication year")
        println("5. Borrow a book")
        println("6. Return a book")
        println("0. Exit")

        print("Enter your choice: ")
        when (readlnOrNull()?.toIntOrNull()) {
            1 -> {
                print("Please Enter Books Title: ")
                val title = readLine() ?: ""
                print("Please Enter Books Author: ")
                val author = readLine() ?: ""
                print("Please Enter Books Published Year: ")
                val published_year = readLine() ?: ""
                library.addBook(Book(title,author,published_year.toInt()))
            }
            2 -> library.displayBooks()
            3 -> {
                print("Enter author's name: ")
                val author = readLine() ?: ""
                library.searchByAuthor(author)
            }
            4 -> {
                print("Enter publication year: ")
                val year = readLine()?.toIntOrNull() ?: 0
                library.searchByYear(year)
            }
            5 -> {
                print("Enter the title of the book you want to borrow: ")
                val titleToBorrow = readLine() ?: ""
                library.borrowBook(titleToBorrow)
            }
            6 -> {
                print("Enter the title of the book you want to return: ")
                val titleToReturn = readLine() ?: ""
                library.returnBook(titleToReturn)
            }
            0 -> {
                println("Exiting the Library System. Goodbye!")
                return
            }
            else -> println("Invalid choice. Please enter a valid option.")
        }
    }
}
